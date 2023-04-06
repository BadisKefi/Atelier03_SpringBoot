package com.badis.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.badis.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
