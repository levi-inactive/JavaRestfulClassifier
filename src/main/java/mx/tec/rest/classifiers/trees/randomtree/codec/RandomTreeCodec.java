package mx.tec.rest.classifiers.trees.randomtree.codec;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import weka.classifiers.trees.RandomTree;

public class RandomTreeCodec {
    private static Logger log = LoggerFactory.getLogger(RandomTreeCodec.class);

    public RandomTree decode(String modelPath) {
        log.debug("Constructing RandomTree...");
        RandomTree randomTree = new RandomTree();
        try {
            randomTree = (RandomTree)
                    weka.core.SerializationHelper.read(modelPath);
            log.info("Random tree classifier loaded");
        } catch (Exception e) {
            log.error("Error while loading random forest classifier");
            log.error(e.getMessage());
        }
        return randomTree;
    }
}
