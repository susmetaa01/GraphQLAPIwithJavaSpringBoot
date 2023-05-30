package com.example.demo.resolver;

import com.example.demo.model.VarianceAction;
import com.example.demo.model.VarianceData;
import com.example.demo.model.VarianceMaster;
import com.example.demo.repository.VarianceActionRepository;
import com.example.demo.repository.VarianceDataRepository;
import com.example.demo.repository.VarianceMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLMutationResolver;
@Component
public class Mutation implements GraphQLMutationResolver {
    @Autowired
    private VarianceMasterRepository varianceMasterRepository;
    @Autowired
    private VarianceDataRepository varianceDataRepository;
    @Autowired
    private VarianceActionRepository varianceActionRepository;
    public VarianceMaster createVarianceMaster(String code, String name, String createdOn) {
        VarianceMaster varianceMaster = new VarianceMaster();
        varianceMaster.setCode(code);
        varianceMaster.setName(name);
        varianceMaster.setCreatedOn(createdOn);
        varianceMasterRepository.save(varianceMaster);
        return varianceMaster;
    }
    public VarianceData createVarianceData(String data, Long varianceMaster) {
        VarianceData varianceData = new VarianceData();
        varianceData.setVarianceMaster(new VarianceMaster(varianceMaster));
        varianceData.setData(data);
        varianceDataRepository.save(varianceData);
        return varianceData;
    }
    public VarianceAction createVarianceAction(String name, Long varianceData) {
        VarianceAction varianceAction = new VarianceAction();
        varianceAction.setVarianceData(new VarianceData(varianceData).getVarianceMaster());
        varianceAction.setName(name);
        varianceActionRepository.save(varianceAction);
        return varianceAction;
    }

}
