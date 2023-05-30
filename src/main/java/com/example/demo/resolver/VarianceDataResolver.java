package com.example.demo.resolver;

import com.example.demo.model.VarianceData;
import com.example.demo.model.VarianceMaster;
import com.example.demo.repository.VarianceMasterRepository;
import graphql.kickstart.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;

public class VarianceDataResolver implements GraphQLResolver<VarianceData> {
    @Autowired
    private VarianceMasterRepository varianceMasterRepository;
    public VarianceMaster getVarianceMaster(VarianceData varianceData) {
        return varianceMasterRepository.findById(varianceData.getVarianceMaster().getId()).orElseThrow(null);
    }
}
