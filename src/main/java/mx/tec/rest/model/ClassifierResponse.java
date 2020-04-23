package mx.tec.rest.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ClassifierResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class ClassifierResponse {
    @XmlElement
    private String classifiedAs;
    @XmlElement
    private int classEnumeration;
    @XmlElement
    private String message;

    public ClassifierResponse() { }

    public ClassifierResponse(String classifiedAs, int classEnumeration, String message) {
        this.classifiedAs = classifiedAs;
        this.classEnumeration = classEnumeration;
        this.message = message;
    }

    public String getClassifiedAs() {
        return classifiedAs;
    }

    public void setClassifiedAs(String classifiedAs) {
        this.classifiedAs = classifiedAs;
    }

    public int getClassEnumeration() {
        return classEnumeration;
    }

    public void setClassEnumeration(int classEnumeration) {
        this.classEnumeration = classEnumeration;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ClassifierResponse{" +
                "classifiedAs='" + classifiedAs + '\'' +
                ", classEnumeration=" + classEnumeration +
                ", message='" + message + '\'' +
                '}';
    }
}
