package com.wesley.aws.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBTable(tableName = "empregados")
public class Empregado implements Serializable {
    @DynamoDBHashKey  (attributeName = "empregadosId")
    @DynamoDBAutoGeneratedKey
    private String empregadosId;
    @DynamoDBAttribute
    private String nome;
    @DynamoDBAttribute
    private int idade;
    @DynamoDBAttribute
    private String email;
    @DynamoDBAttribute
    private Endereco endereco;

}
