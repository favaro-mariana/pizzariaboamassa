package com.itb.inf3bn.pizzariaboamassa.model.services;

import org.springframework.stereotype.Service;

import com.itb.inf3bn.pizzariaboamassa.model.repository.ItemPedidoRepository;

@Service
public class ItemPedidoService {

private final ItemPedidoRepository itempedidoRepository;

public ItemPedidoService (ItemPedidoRepository itempedidoRepository) {
    this.itempedidoRepository = itempedidoRepository;
}

}
