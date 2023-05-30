package com.example.demo.resolver;

import com.example.demo.model.VarianceAction;
import com.example.demo.model.VarianceMaster;
import com.example.demo.repository.VarianceMasterRepository;
import graphql.kickstart.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class VarianceActionResolver implements GraphQLResolver<VarianceAction> {
    @Autowired
    private VarianceMasterRepository varianceMasterRepository;
    public VarianceMaster getVarianceData(VarianceAction varianceAction) {
        return varianceMasterRepository.findById(varianceAction.getVarianceData().getId()).orElseThrow(null);
    }
}
