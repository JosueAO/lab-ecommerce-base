package com.josueao.labcommercebase.dto;

import com.josueao.labcommercebase.entities.Product;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class ProductDTO {

    private Long id;

    @Size(min = 3, max = 60, message = "O nome do produto deve ter entre 5 e 60 caracteres")
    @NotBlank(message = "Campo obrigatório")
    private String name;

    @Size(min = 10, message = "A descrição do produto deve ter no mímimo 10 caracteres")
    @NotBlank(message = "Campo obrigatório")
    private String description;

    @Positive(message = "O preço do produto deve ser um valor positivo")
    private Double price;
    private String imgUrl;

    public ProductDTO() { // No momento somente para: Jackson(lib para serializar e desserializar JSON). O Jackson precisa de um construtor sem argumento OU ANOTAÇÃO especifica para desserializar o JSON.
    }

    public ProductDTO(Long id, String name, String description, Double price, String imgUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    public ProductDTO(Product entity) {
        id = entity.getId();
        name = entity.getName();
        description = entity.getDescription();
        price = entity.getPrice();
        imgUrl = entity.getImgUrl();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
