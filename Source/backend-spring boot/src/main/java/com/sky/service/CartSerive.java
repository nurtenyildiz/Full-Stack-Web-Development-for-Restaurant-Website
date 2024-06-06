package com.sky.service;

import com.sky.Exception.CartException;
import com.sky.Exception.CartItemException;
import com.sky.Exception.FoodException;
import com.sky.Exception.UserException;
import com.sky.model.Cart;
import com.sky.model.CartItem;
import com.sky.model.Food;
import com.sky.model.User;
import com.sky.request.AddCartItemRequest;
import com.sky.request.UpdateCartItemRequest;

public interface CartSerive {

	public CartItem addItemToCart(AddCartItemRequest req, String jwt) throws UserException, FoodException, CartException, CartItemException;

	public CartItem updateCartItemQuantity(Long cartItemId,int quantity) throws CartItemException;

	public Cart removeItemFromCart(Long cartItemId, String jwt) throws UserException, CartException, CartItemException;

	public Long calculateCartTotals(Cart cart) throws UserException;
	
	public Cart findCartById(Long id) throws CartException;
	
	public Cart findCartByUserId(Long userId) throws CartException, UserException;
	
	public Cart clearCart(Long userId) throws CartException, UserException;
	

	

}
