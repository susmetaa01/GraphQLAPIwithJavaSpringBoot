package com.example.demo.resolver;

import com.example.demo.model.VarianceAction;
import com.example.demo.model.VarianceData;
import com.example.demo.model.VarianceMaster;
import com.example.demo.repository.VarianceActionRepository;
import com.example.demo.repository.VarianceDataRepository;
import com.example.demo.repository.VarianceMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class Query implements GraphQLQueryResolver {
    @Autowired
    private VarianceMasterRepository varianceMasterRepository;
    @Autowired
    private VarianceActionRepository varianceActionRepository;
    @Autowired
    private VarianceDataRepository varianceDataRepository;
    public Iterable<VarianceMaster> findAllVarianceMasters() {
        return varianceMasterRepository.findAll();
    }
    public Iterable<VarianceAction> findAllVarianceActions() {
        return varianceActionRepository.findAll();
    }
    public Iterable<VarianceData> findAllVarianceData() {
        return varianceDataRepository.findAll();
    }
}
