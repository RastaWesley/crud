package com.wesley.aws.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.wesley.aws.entity.Empregado;

import java.util.HashMap;
import java.util.Map;

@Repository
public class EmpregadosRepositorio {

    @Autowired
    private DynamoDBMapper mapper;


    public Empregado addEmpregado(Empregado empregado){
        mapper.save(empregado);
        return empregado;
    }

    public Empregado getEmpregadoId(String empregadosId){
        return mapper.load(Empregado.class, empregadosId);
    }

    public String deletarEmpregado(Empregado empregado) {
        mapper.delete(empregado);
        return "Empregado Removido !!";
    }

    public String editarEmpregado(Empregado empregado) {
        mapper.save(empregado, buildExpression(empregado));
        return "Atualizado";
    }

    private DynamoDBSaveExpression buildExpression(Empregado empregado) {
        DynamoDBSaveExpression dynamoDBSaveExpression = new DynamoDBSaveExpression();
        Map<String, ExpectedAttributeValue> expectedMap = new HashMap<>();
        expectedMap.put("empregadosId", new ExpectedAttributeValue(new AttributeValue().withS(empregado.getEmpregadosId())));
        dynamoDBSaveExpression.setExpected(expectedMap);
        return dynamoDBSaveExpression;
    }


}
