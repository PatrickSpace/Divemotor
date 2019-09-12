package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Area;
import pe.edu.upc.service.IAreaService;

@Named
@RequestScoped
public class AreaController {

	@Inject
	private IAreaService aS;
	private Area area;
	private List<Area> listaareas;
	
	@PostConstruct
	public void init()
	{
		this.listaareas= new ArrayList<Area>();
		this.area= new Area();
		listar();
	}
	
	public Area getArea() {
		return area;
	}
	public void setArea(Area area) {
		this.area = area;
	}
	public List<Area> getListaareas() {
		return listaareas;
	}
	public void setListaareas(List<Area> listaareas) {
		this.listaareas = listaareas;
	}
	
	
	public void listar()
	{
		try
		{
			this.listaareas= aS.listararea();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
