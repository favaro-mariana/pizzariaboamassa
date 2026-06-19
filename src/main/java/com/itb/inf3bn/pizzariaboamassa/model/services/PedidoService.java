
package com.itb.inf3bn.pizzariaboamassa.model.services;

import org.springframework.stereotype.Service;

import com.itb.inf3bn.pizzariaboamassa.model.repository.PedidoRepository;

@Service
public class PedidoService {

private final PedidoRepository pedidoRepository;

public PedidoService (PedidoRepository pedidoRepository) {
    this.pedidoRepository = pedidoRepository;
}

}
