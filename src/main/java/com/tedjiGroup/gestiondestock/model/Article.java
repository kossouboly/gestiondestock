package com.tedjiGroup.gestiondestock.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="article")
public class Article  extends AbstractEntity{

@Column(name="codearticle")
private String codeArticle;

@Column(name="designation")
private String designation;

@Column(name="prixunitaireht")
private BigDecimal prixUnitaireHt      ;

@Column(name="tauxtva")
private BigDecimal tauxTva;


@Column(name="prixunitairettc")
private BigDecimal prixUnitaireTtc;


@Column(name="photo")
private String photo;



}
