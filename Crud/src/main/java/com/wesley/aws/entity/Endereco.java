package com.wesley.aws.entity;

import java.io.Serializable;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@DynamoDBDocument
@Data
@AllArgsConstructor
@NoArgsConstructor


public class Endereco implements Serializable {
    @DynamoDBAttribute
    private String cidade;
    @DynamoDBAttribute
    private String estado;
    @DynamoDBAttribute
    private long cep;
}