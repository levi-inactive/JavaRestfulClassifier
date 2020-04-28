package mx.tec.rest.classifiers.trees.reptree;

import mx.tec.rest.classifiers.Classifier;
import mx.tec.rest.classifiers.trees.randomtree.RandomTreeBinClassifier;
import mx.tec.rest.service.ClassifierService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import weka.classifiers.trees.REPTree;

import java.io.ObjectInputStream;
import java.net.URL;

public class REPTreeBinClassifier extends Classifier {
    private static Logger log = LoggerFactory.getLogger(RandomTreeBinClassifier.class);

    @Override
    public REPTree decode(String modelPath) {
        log.debug("Constructing REPTree...");
        REPTree repTree = new REPTree();
        try {
            URL resource = ClassifierService.class.getClassLoader().getResource(modelPath);
            log.info("Recuperando url del modelo: " + resource);
            ObjectInputStream ois = new ObjectInputStream(resource.openStream());
            repTree = (REPTree) ois.readObject();
            ois.close();
            log.info("REPTree classifier loaded");
        } catch (Exception e) {
            log.error("Error while loading random forest classifier");
            e.printStackTrace();
            log.error(e.getMessage());
        }
        return repTree;
    }
}
