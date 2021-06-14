package com.company;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

AWS Access Key ID: wesley.marcos2910@hotmail.com
        AWS Secret Access Key: 1234qwer2910!A


@Entity
@Table(name = "empregado")

public class Empregado {
    private long id;
    private String primeiroNome;
    private String sobrenome;
    private String emailId;

    public Empregado(){

    }

    public Empregado(String primeiroNome, String sobrenome, String emailId){
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.emailId = emailId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.Auto)
    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    @Column(nome = "primeiroNome", nullable = false)
    public String getprimeiroNome() {
        return primeiroNome;
    }
    public void setprimeiroNome(String primeiroNome) {
        this.primeiroNome = this.primeiroNome;
    }

    @Column(nome = "sobrenomme", nullable = false)
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Column(nome = "email_address", nullable = false)
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "empregado [id=" + id + ", Primeiro nome=" + primeiroNome + ", Sobrenome=" + sobrenome + ", Email=" + emailId
                + "]";
    }

}