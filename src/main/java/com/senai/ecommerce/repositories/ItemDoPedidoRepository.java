package com.senai.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.ecommerce.entities.ItemDoPedido;
import com.senai.ecommerce.entities.ItemDoPedidoPK;

public interface ItemDoPedidoRepository extends JpaRepository<ItemDoPedido, ItemDoPedidoPK> {

}
