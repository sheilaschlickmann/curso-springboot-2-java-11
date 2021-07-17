package com.sheila.course.resources;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sheila.course.entities.Order;
import com.sheila.course.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

	@Autowired
	private OrderService service;

	@GetMapping
	public ResponseEntity<List<Order>> findAll() {
		List<Order> list = service.findAll();
		for(Order order : list) {
			long id = order.getId();
			order.add(linkTo(methodOn(OrderResource.class).findById(id)).withSelfRel());
		}	
		return ResponseEntity.ok().body(list);	
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) {
		Order obj = service.findById(id);
		obj.add(linkTo(methodOn(OrderResource.class).findAll()).withRel("Lista de Pedidos"));
		return ResponseEntity.ok().body(obj);
	}

}
