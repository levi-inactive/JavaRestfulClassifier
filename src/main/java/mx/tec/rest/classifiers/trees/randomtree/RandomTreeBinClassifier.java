package mx.tec.rest.classifiers.trees.randomtree;

import mx.tec.rest.classifiers.classifier.Classifier;
import mx.tec.rest.classifiers.trees.randomtree.codec.RandomTreeCodec;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import mx.tec.rest.model.Flow;
import weka.classifiers.trees.RandomTree;
import weka.core.Attribute;
import weka.core.DenseInstance;
import weka.core.Instance;

import java.util.ArrayList;

public class RandomTreeBinClassifier extends Classifier {
    public enum Class {
        /**
         * Indicates if there was an error while classifying the flow
         */
        ERROR(-1),

        /**
         * Indicates if the flow is part of normal network traffic
         */
        NORMAL(0),

        /**
         * Indicates if the flow is part of a http ddos attack
         */
        ATTACK(1),

        /**
         * Indicates if the flow is part of a http ddos slowbody2 attack
         */
        SLOWBODY2(2),

        /**
         * Indicates if the flow is part of a http ddos slowread attack
         */
        SLOWREAD(3),

        /**
         * Indicates if the flow is part of a http ddos ddossim attack
         */
        DDOSSIM(4),

        /**
         * Indicates if the flow is part of a http ddos slowheaders attack
         */
        SLOWHEADERS(5),

        /**
         * Indicates if the flow is part of a http ddos goldeneye attack
         */
        GOLDENEYE(6),

        /**
         * Indicates if the flow is part of a http ddos rudy attack
         */
        RUDY(7),

        /**
         * Indicates if the flow is part of a http ddos hulk attack
         */
        HULK(8),

        /**
         * Indicates if the flow is part of a http ddos slowloris attack
         */
        SLOWLORIS(9);

        private final int value;

        private Class(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static Class valueOf(int value) {
            switch(value){
                case 0:
                    return RandomTreeBinClassifier.Class.NORMAL;
                case 1:
                    return RandomTreeBinClassifier.Class.ATTACK;
                case 2:
                    return RandomTreeBinClassifier.Class.SLOWBODY2;
                case 3:
                    return RandomTreeBinClassifier.Class.SLOWREAD;
                case 4:
                    return RandomTreeBinClassifier.Class.DDOSSIM;
                case 5:
                    return RandomTreeBinClassifier.Class.SLOWHEADERS;
                case 6:
                    return RandomTreeBinClassifier.Class.GOLDENEYE;
                case 7:
                    return RandomTreeBinClassifier.Class.RUDY;
                case 8:
                    return RandomTreeBinClassifier.Class.HULK;
                case 9:
                    return RandomTreeBinClassifier.Class.SLOWLORIS;
                default:
                    return RandomTreeBinClassifier.Class.ERROR;
            }
        }
    }

    private static Logger log = LoggerFactory.getLogger(RandomTreeBinClassifier.class);

    private RandomTree tree;

    public void Load(String filepath) {
        try {
            log.debug("Constructing codec...");
            RandomTreeCodec codec = new RandomTreeCodec();
            tree = codec.decode(filepath);
            super.Load(filepath);
        } catch (Exception e) {
            log.error("Exception thrown at Load()");
            log.error(e.getMessage());
        }
    }

    /**
     * Classifies the flow
     *
     * @return int enumerator that determines the class of the FlowData parameter
     */
    public int Classify(Flow f) {
        try {
            if (super.Classify(f) == -1) {
                return Class.ERROR.value;
            }

            log.debug("Building instance for classification.");
            Instance instance = buildInstance(f);

            try {
                log.debug("Calling classifyInstance()...");
                Double doubleClass = tree.classifyInstance(instance);
                Class classifiedAs = Class.valueOf(doubleClass.intValue());

                log.debug("Flow classified as " + classifiedAs);

                return classifiedAs.value;
            } catch(Exception e) {
                log.error("Error while trying to classify flow.");
                log.error(e.getMessage());
            }
        } catch (Exception e) {
            log.error("Exception thrown at Classify");
            log.error(e.getMessage());
        }

        return Class.ERROR.value;
    }

    private Instance buildInstance(Flow f) {
        try {
            /**
             * Create 39 empty attributes.
             */
            Attribute total_fpackets = new Attribute("total_fpackets");
            Attribute total_fvolume = new Attribute("total_fvolume");
            Attribute total_bpackets = new Attribute("total_bpackets");
            Attribute total_bvolume = new Attribute("total_bvolume");
            Attribute min_fpktl = new Attribute("min_fpktl");
            Attribute mean_fpktl = new Attribute("mean_fpktl");
            Attribute max_fpktl = new Attribute("max_fpktl");
            Attribute std_fpktl = new Attribute("std_fpktl");
            Attribute min_bpktl = new Attribute("min_bpktl");
            Attribute mean_bpktl = new Attribute("mean_bpktl");
            Attribute max_bpktl = new Attribute("max_bpktl");
            Attribute std_bpktl = new Attribute("std_bpktl");
            Attribute min_fiat = new Attribute("min_fiat");
            Attribute mean_fiat = new Attribute("mean_fiat");
            Attribute max_fiat = new Attribute("max_fiat");
            Attribute std_fiat = new Attribute("std_fiat");
            Attribute min_biat = new Attribute("min_biat");
            Attribute mean_biat = new Attribute("mean_biat");
            Attribute max_biat = new Attribute("max_biat");
            Attribute std_biat = new Attribute("std_biat");
            Attribute duration = new Attribute("duration");
            Attribute min_active = new Attribute("min_active");
            Attribute mean_active = new Attribute("mean_active");
            Attribute max_active = new Attribute("max_active");
            Attribute std_active = new Attribute("std_active");
            Attribute min_idle = new Attribute("min_idle");
            Attribute mean_idle = new Attribute("mean_idle");
            Attribute max_idle = new Attribute("max_idle");
            Attribute std_idle = new Attribute("std_idle");
            Attribute sflow_fpackets = new Attribute("sflow_fpackets");
            Attribute sflow_fbytes = new Attribute("sflow_fbytes");
            Attribute sflow_bpackets = new Attribute("sflow_bpackets");
            Attribute sflow_bbytes = new Attribute("sflow_bbytes");
            Attribute fpsh_cnt = new Attribute("fpsh_cnt");
            Attribute bpsh_cnt = new Attribute("bpsh_cnt");
            Attribute furg_cnt = new Attribute("furg_cnt");
            Attribute total_fhlen = new Attribute("total_fhlen");
            Attribute total_bhlen = new Attribute("total_bhlen");

            /**
             * Create empty instance that sets weight to one,
             * all values to be missing, and the reference to
             * the dataset to null.
             */
            Instance instance = new DenseInstance(40);
            instance.setClassMissing();

            instance.setValue(total_fpackets, f.getTotal_fpackets());
            instance.setValue(total_fvolume, f.getTotal_fvolume());
            instance.setValue(total_bpackets, f.getTotal_bpackets());
            instance.setValue(total_bpackets, f.getTotal_bpackets());
            instance.setValue(total_bvolume, f.getTotal_bvolume());
            instance.setValue(min_fpktl, f.getMin_fpktl());
            instance.setValue(mean_fpktl, f.getMean_fpktl());
            instance.setValue(max_fpktl, f.getMax_fpktl());
            instance.setValue(std_fpktl, f.getStd_fpktl());
            instance.setValue(min_bpktl, f.getMin_bpktl());
            instance.setValue(mean_bpktl, f.getMean_bpktl());
            instance.setValue(max_bpktl, f.getMax_bpktl());
            instance.setValue(std_bpktl, f.getStd_bpktl());
            instance.setValue(min_fiat, f.getMin_fiat());
            instance.setValue(mean_fiat, f.getMean_fiat());
            instance.setValue(max_fiat, f.getMax_fiat());
            instance.setValue(std_fiat, f.getStd_fiat());
            instance.setValue(min_biat, f.getMin_biat());
            instance.setValue(mean_biat, f.getMean_biat());
            instance.setValue(max_biat, f.getMax_biat());
            instance.setValue(std_biat, f.getStd_biat());
            instance.setValue(duration, f.getDuration());
            instance.setValue(min_active, f.getMin_active());
            instance.setValue(mean_active, f.getMean_active());
            instance.setValue(max_active, f.getMax_active());
            instance.setValue(std_active, f.getStd_active());
            instance.setValue(min_idle, f.getMin_idle());
            instance.setValue(mean_idle, f.getMean_idle());
            instance.setValue(max_idle, f.getMax_idle());
            instance.setValue(std_idle, f.getStd_idle());
            instance.setValue(sflow_fpackets, f.getSflow_fpackets());
            instance.setValue(sflow_fbytes, f.getSflow_fbytes());
            instance.setValue(sflow_bpackets, f.getSflow_bpackets());
            instance.setValue(sflow_bbytes, f.getSflow_bbytes());
            instance.setValue(fpsh_cnt, f.getFpsh_cnt());
            instance.setValue(bpsh_cnt, f.getBpsh_cnt());
            instance.setValue(furg_cnt, f.getFurg_cnt());
            instance.setValue(total_fhlen, f.getTotal_fhlen());
            instance.setValue(total_bhlen, f.getTotal_bhlen());

            return instance;
        } catch (Exception e) {
            log.error("Exception thrown at buildInstance()");
            log.error(e.getMessage());
        }

        return null;
    }
}