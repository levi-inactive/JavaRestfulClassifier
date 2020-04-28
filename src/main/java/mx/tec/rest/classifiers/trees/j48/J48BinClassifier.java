package mx.tec.rest.classifiers.trees.j48;

import mx.tec.rest.classifiers.Classifier;
import mx.tec.rest.classifiers.trees.randomtree.RandomTreeBinClassifier;
import mx.tec.rest.service.ClassifierService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import weka.classifiers.trees.J48;
import weka.classifiers.trees.RandomTree;

import java.io.ObjectInputStream;
import java.net.URL;

public class J48BinClassifier extends Classifier {
    private static Logger log = LoggerFactory.getLogger(J48BinClassifier.class);

    @Override
    public J48 decode(String modelPath) {
        log.debug("Constructing J48...");
        J48 j48 = new J48();
        try {
            URL resource = ClassifierService.class.getClassLoader().getResource(modelPath);
            log.info("Recuperando url del modelo: " + resource);
            ObjectInputStream ois = new ObjectInputStream(resource.openStream());
            j48 = (J48) ois.readObject();
            ois.close();
            log.info("J48 classifier loaded");
        } catch (Exception e) {
            log.error("Error while loading random forest classifier");
            e.printStackTrace();
            log.error(e.getMessage());
        }
        return j48;
    }
}
