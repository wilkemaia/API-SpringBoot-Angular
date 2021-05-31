package com.project.bootcamp.bootcamp.mapper;

import com.project.bootcamp.bootcamp.model.Stock;
import com.project.bootcamp.bootcamp.model.StockDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StockMapper {
    public Stock toEntity(StockDTO dto) {

        Stock stock = new Stock();
        stock.setId(dto.getId());
        stock.setName(dto.getName());
        stock.setPrice(dto.getPrice());
        stock.setVariation(dto.getVariantion());
        stock.setDate(dto.getDate());
        return stock;
    }

    public StockDTO toDto(Stock stock) {

        StockDTO dto = new StockDTO();
        dto.setId(stock.getId());
        dto.setName(stock.getName());
        dto.setPrice(stock.getPrice());
        dto.setVariantion(stock.getVariation());
        dto.setDate(stock.getDate());
        return  dto;

    }

    public List<StockDTO> toDto(List<Stock>listaStock){
        return  listaStock.stream().map(this::toDto).collect(Collectors.toList());
    }

}
