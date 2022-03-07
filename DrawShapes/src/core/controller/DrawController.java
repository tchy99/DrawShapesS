package core.controller;


import core.view.*;
import core.model.*;


public class DrawController {
	
	public void strat() {
		DrawView flux = new DrawView();
		DrawModel form = new DrawModel();
		
		flux.bienvenue();
		String test = flux.choix();
		
		switch(test.toLowerCase().trim()) {
		case "a":	int dim = flux.dimTriangle();
					form.setmDim(dim);
					flux.Display();
					form.drawTriangle(form.getmDim());
					break;
					
		case "b": 	int dam=flux.dimSquare();
					form.setmDim(dam);
					flux.Display();
					form.drawSquare(form.getmDim());
					flux.fichier();
					break;
					
		case "c":  	int dem=flux.LRectangle();
					int deem=flux.lRectangle();
					form.setmL(deem);
					form.setMl(dem);
					flux.Display();
					form.drawRect(form.getmL(), form.getMl());
					break;
					
		case "d":	int diim=flux.dimDiamond();
					form.setmDim(diim);
					flux.Display();
					form.drawDiamond(form.getmDim());
					break;
					
		case "e":	int dum=flux.dimCircle();
					form.setmDim(dum);
					flux.Display();
					form.drawCircle(form.getmDim());
					break;
					
		case "f":	int duum=flux.line();
					int duuum=flux.column();
					form.setmLi(duum);
					form.setmCo(duuum);
					form.drawParalelogram(form.getmLi(),form.getmCo());
					break;
		case "g": 	flux.bye();
					System.exit(0);
					break;
	}
	}
}


