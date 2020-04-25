package mx.tec.rest.classifiers.trees.randomtree.codec;

import mx.tec.rest.service.ClassifierService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import weka.classifiers.trees.RandomTree;

import java.net.URL;

public class RandomTreeCodec {
    private static Logger log = LoggerFactory.getLogger(RandomTreeCodec.class);

    public RandomTree decode(String modelPath) {
        log.debug("Constructing RandomTree...");
        RandomTree randomTree = new RandomTree();
        try {
            URL resource = ClassifierService.class.getResource(modelPath);
            randomTree = (RandomTree)
                    weka.core.SerializationHelper.read(resource.getFile());
            log.info("Random tree classifier loaded");
        } catch (Exception e) {
            log.error("Error while loading random forest classifier");
            log.error(e.getMessage());
        }
        return randomTree;
    }
}
