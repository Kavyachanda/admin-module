/*package com.niit.shoppingcart.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.niit.shoppingcart.DAO.CategoryDAO;
import com.niit.shoppingcart.DAO.ProductDAO;
import com.niit.shoppingcart.model.Product;

@Controller
public class Productcontroller {
	
	@Autowired
	private ProductDAO productDAO;
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@RequestMapping(value="/",method = RequestMethod.GET)
	public String landPage(@ModelAttribute("product")Product item,BindingResult result,Model model)
	{
		
		model.addAttribute("allData",productDAO.list());
		return "Product";
		
	}
	 
	@RequestMapping(value="/allData")
	public String getAllData(@ModelAttribute("product")Product item,BindingResult result,Model model)
	{
	
		model.addAttribute("allData",productDAO.list());
		model.addAttribute("allCategory",categoryDAO.list());
		return "Product";
	}
	@RequestMapping(value="/addItem",method = RequestMethod.POST)
public String addItem(@ModelAttribute("product") Product p){
		
		this.productDAO.saveOrUpdate(p);
		return "redirect:allData";
		
	}
	@RequestMapping(value="/ItemById/{id}",method = RequestMethod.GET)
	public String editItem(@PathVariable("id") int id,RedirectAttributes redirectAttributes)
	{
		redirectAttributes.addFlashAttribute("product", productDAO.get(id));
		return "redirect:/allData";
		
}
	@RequestMapping(value="/deleteById/{id}",method = RequestMethod.GET)
	public String deleteItem(@PathVariable("id") int id,Product product)
	{
		productDAO.delete(product);
		return "redirect:/allData";
		
}
}

*/