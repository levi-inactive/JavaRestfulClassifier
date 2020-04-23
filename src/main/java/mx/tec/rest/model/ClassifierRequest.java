package mx.tec.rest.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ClassifierRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class ClassifierRequest {
    private String classifier;
    private Flow flow;

    public ClassifierRequest() { }

    public ClassifierRequest(String classifier, Flow flow) {
        this.classifier = classifier;
        this.flow = flow;
    }

    public String getClassifier() {
        return classifier;
    }

    public void setClassifier(String classifier) {
        this.classifier = classifier;
    }

    public Flow getFlow() {
        return flow;
    }

    public void setFlow(Flow flow) {
        this.flow = flow;
    }

    @Override
    public String toString() {
        return "ClassifierRequest{" +
                "classifier='" + classifier + '\'' +
                ", flow=" + flow +
                '}';
    }
}
