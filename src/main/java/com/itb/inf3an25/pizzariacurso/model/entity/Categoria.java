package com.itb.inf3an25.pizzariacurso.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;

@Entity
@Table(name = "categorias")
@Data
public class Categoria {
   
 
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column(nullable = false, length = 100)
private String nome;
@Column(nullable = false, length = 255)
private String descricao;
private boolean codStatus;
 
 
@Transient
private String mensagemErro = "";
@Transient
private boolean isValid = true;
 
 
 

    
}
