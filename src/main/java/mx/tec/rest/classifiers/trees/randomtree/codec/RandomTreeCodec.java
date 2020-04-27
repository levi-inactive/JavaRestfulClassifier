package mx.tec.rest.classifiers.trees.randomtree.codec;

import mx.tec.rest.service.ClassifierService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import weka.classifiers.trees.RandomTree;

import java.io.*;
import java.net.URL;
import java.util.Objects;

public class RandomTreeCodec {
    private static Logger log = LoggerFactory.getLogger(RandomTreeCodec.class);

    public RandomTree decode(String modelPath) {
        log.debug("Constructing RandomTree...");
        RandomTree randomTree = new RandomTree();
        try {
            URL resource = ClassifierService.class.getClassLoader().getResource(modelPath);
            log.info("Recuperando url del modelo: "+resource);
            final InputStream inputStream;
            inputStream = resource.openStream();
                final InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                final BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String s="";
//                while ( (s=bufferedReader.readLine())!=null){
//                    System.out.println(s);
//                }
            /*String filePath = Objects.requireNonNull(RandomTreeCodec.class
                    .getClassLoader()
                    .getResource("models/randomtree.appddos.model"))
                    .getPath();*/
            //assert resource != null;
            ObjectInputStream ois = new ObjectInputStream(resource.openStream());
            //String filePath= RandomTreeCodec.class.getResource(modelPath).getPath();
            randomTree = (RandomTree) ois.readObject();
            ois.close();
            //randomTree = (RandomTree) weka.core.SerializationHelper.read(filePath);
            log.info("Random tree classifier loaded");
        } catch (Exception e) {
            log.error("Error while loading random forest classifier");
            e.printStackTrace();
            log.error(e.getMessage());
        }
        return randomTree;
    }
}
