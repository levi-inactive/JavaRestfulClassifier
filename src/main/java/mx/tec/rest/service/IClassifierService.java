package mx.tec.rest.service;

import mx.tec.rest.model.ClassifierRequest;
import mx.tec.rest.model.ClassifierResponse;
import mx.tec.rest.model.Flow;

public interface IClassifierService {
    ClassifierResponse classifyFlow(ClassifierRequest request);
}
