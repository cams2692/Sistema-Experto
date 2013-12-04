/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemaexperto.logic;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Cesar
 */
public class Computadores {
    
    private ArrayList<Computador> computadores;

    public Computadores() {
        computadores= new ArrayList<>();
        cargarInfo();
    }
    
    
    public ArrayList<Computador> searchPc(Necesidades n){
       ArrayList<Computador> pcs = new ArrayList<>();
       Iterator<Necesidad> necesidad= n.getNecesidades().iterator();
        
       if(!n.getMarca().equals("Por Defecto")){
           for(int i=0;i<computadores.size();i++){
               if(n.getMarca().equalsIgnoreCase(computadores.get(i).getMarca()))
                pcs.add(computadores.get(i));
           }
       }else{
           pcs=computadores;
       }
       
       while(necesidad.hasNext()){
           ArrayList<Computador> aux= new ArrayList<>();
           Necesidad auxN=necesidad.next();
           boolean copiar=false;
           if(auxN.getComponente().equals("Valor")){
               for(int i=0;i<pcs.size();i++){
                   if(pcs.get(i).getPrioridad()==auxN.getPrioridad()){
                       aux.add(pcs.get(i));
                       copiar=true;
                   }
               }
           }else{
               if(auxN.getComponente().equals("Procesador")){
                   for(int i=0;i<pcs.size();i++){
                        if(pcs.get(i).getProcesador().getPrioridad()==auxN.getPrioridad()){
                            aux.add(pcs.get(i));
                            copiar=true;
                        }
                   }
                }else{
                   if(auxN.getComponente().equals("Disco duro")){
                        for(int i=0;i<pcs.size();i++){
                            if(pcs.get(i).getDisco().getPrioridad()==auxN.getPrioridad()){
                                aux.add(pcs.get(i));
                                copiar=true;
                            }
                        }
                    }else{
                       if(auxN.getComponente().equals("RAM")){
                            for(int i=0;i<pcs.size();i++){
                                if(pcs.get(i).getRam().getPrioridad()==auxN.getPrioridad()){
                                    aux.add(pcs.get(i));
                                    copiar=true;
                                }
                            }
                        }else{
                            if(auxN.getComponente().equals("GPU")){
                                    for(int i=0;i<pcs.size();i++){
                                        if(pcs.get(i).getTarjeta().getPrioridad()==auxN.getPrioridad()){
                                            aux.add(pcs.get(i));
                                            copiar=true;
                                        }
                                    }   
                            }
                        }
                    }
                }
           }
           if(copiar){
               pcs=aux;
           }
          
       }
       return pcs;
    }

    /**
     * @return the computadores
     */
    public ArrayList<Computador> getComputadores() {
        return computadores;
    }

    /**
     * @param computadores the computadores to set
     */
    public void setComputadores(ArrayList<Computador> computadores) {
        this.computadores = computadores;
    }
    
    
    public void cargarInfo(){
       DiscoDuro duro=new DiscoDuro("1TB", "80MB/s", "Toshiba", (byte)3, "MX7");
       Procesador procesador= new Procesador("3GHZ", "64 bits", "Intel","4 nucleos",(byte) 3,"I7 3 generacion");
        Ram ram=new Ram("16 GB", "DDR5", "30MB/s", "Samsung",(byte) 3,"MX80" );
       TarjetaGrafica grafica= new TarjetaGrafica("40MHZ", "DDR5", "2GB", "Nvidia", (byte) 3, "TILA");
       
       computadores.add(new Computador(3000000, duro, procesador, ram, grafica, "Toshiba", (byte) 3, "Qosmio"));
       
         duro=new DiscoDuro("750GB", "80MB/s", "Apple", (byte)3, "AppleDiscos");
        procesador= new Procesador("3GHZ", "64 bits", "Intel","4 nucleos",(byte) 3,"I7 3 generacion");
         ram=new Ram("8 GB", "DDR5", "30MB/s", "Apple",(byte) 3,"AppleRams" );
        grafica= new TarjetaGrafica("40MHZ", "DDR5", "1GB", "Nvidia", (byte) 3, "Geforce 450M");
       
       computadores.add(new Computador(4000000, duro, procesador, ram, grafica, "Mac", (byte) 3, "MacBook Pro"));
       
        duro=new DiscoDuro("500GB", "80MB/s", "Toshiba", (byte)2, "ToshibaDiscos");
        procesador= new Procesador("2.4GHZ", "64 bits", "Intel","4 nucleos",(byte) 2,"I5 1 generacion");
         ram=new Ram("4 GB", "DDR3", "30MB/s", "Toshiba",(byte) 2,"ToshibaRam" );
        grafica= new TarjetaGrafica("40MHZ", "DDR5", "1GB", "Nvidia", (byte) 2, "Geforce 320M");
       
       computadores.add(new Computador(1500000, duro, procesador, ram, grafica, "Toshiba", (byte) 1, "Satellite A665"));
       
        duro=new DiscoDuro("750GB", "80MB/s", "Dell", (byte)2, "DellDiscos");
        procesador= new Procesador("3GHZ", "64 bits", "Intel","4 nucleos",(byte) 2,"I5 3 generacion");
         ram=new Ram("8 GB", "DDR3", "30MB/s", "Dell",(byte) 3,"DellRam" );
        grafica= new TarjetaGrafica("40MHZ", "DDR3", "1GB", "Nvidia", (byte) 3, "Geforce 750M");
       
       computadores.add(new Computador(2500000, duro, procesador, ram, grafica, "Dell", (byte) 2, "Alien Ware 14"));
       
       duro=new DiscoDuro("750GB", "80MB/s", "Dell", (byte)2, "DellDiscos");
        procesador= new Procesador("3GHZ", "64 bits", "Intel","4 nucleos",(byte) 3,"I7 3 generacion");
         ram=new Ram("16 GB", "DDR3", "30MB/s", "Dell",(byte) 3,"DellRam" );
        grafica= new TarjetaGrafica("40MHZ", "DDR5", "2GB", "Nvidia", (byte) 3, "Geforce 765M");
       
       computadores.add(new Computador(2500000, duro, procesador, ram, grafica, "Dell", (byte) 2, "Alien Ware 14"));
       
       duro=new DiscoDuro("120GB", "80MB/s", "Dell", (byte)1, "DellDiscos");
       procesador= new Procesador("2MHZ", "64 bits", "Intel","2 nucleos",(byte) 1,"Core 2 Duo");
       ram=new Ram("2GB", "DDR2", "30MB/s", "Dell",(byte) 1,"DellRam" );
       grafica= new TarjetaGrafica("20MHZ", "DDR2", "520MB", "Intel", (byte) 1, "Integrated");
       
       computadores.add(new Computador(1000000, duro, procesador, ram, grafica, "Dell", (byte) 1, "Inspiron 1525"));
               
       duro=new DiscoDuro("750GB", "80MB/s", "Toshiba", (byte)2, "ToshibaDiscos");
        procesador= new Procesador("2.5GHZ", "64 bits", "Intel","4 nucleos",(byte) 2,"I5 3 generacion");
         ram=new Ram("4 GB", "DDR3", "30MB/s", "Toshiba",(byte) 2,"ToshibaRam" );
        grafica= new TarjetaGrafica("40MHZ", "DDR3", "1GB", "Nvidia", (byte) 2, "Geforce 150M");
       
       computadores.add(new Computador(2300000, duro, procesador, ram, grafica, "Toshiba", (byte) 2, "Satellite S225"));
       
        duro=new DiscoDuro("250GB", "80MB/s", "Dell", (byte)2, "DellDiscos");
        procesador= new Procesador("2.4GHZ", "64 bits", "AMD","4 nucleos",(byte) 2,"Athlon X2");
         ram=new Ram("2 GB", "DDR3", "30MB/s", "Dell",(byte) 2,"DellRam" );
        grafica= new TarjetaGrafica("40MHZ", "DDR3", "520MB", "ATI", (byte) 2, "Radeon S345");
       
       computadores.add(new Computador(1800000, duro, procesador, ram, grafica, "Dell", (byte) 1, "Inspiron M256"));
       
        duro=new DiscoDuro("500GB", "80MB/s", "Compaq", (byte)2, "CompaqDiscos");
        procesador= new Procesador("2.5GHZ", "64 bits", "Intel","4 nucleos",(byte) 2,"I5 2 generacion");
         ram=new Ram("4 GB", "DDR3", "30MB/s", "Compaq",(byte) 2,"Compaq" );
        grafica= new TarjetaGrafica("40MHZ", "DDR3", "1GB", "Intel", (byte)1, "Integrated");
       
       computadores.add(new Computador(1850000, duro, procesador, ram, grafica, "Compaq", (byte) 1, "Presario"));
       
       duro=new DiscoDuro("750GB", "80MB/s", "Compaq", (byte)2, "CompaqDiscos");
        procesador= new Procesador("2.5GHZ", "64 bits", "Intel","4 nucleos",(byte) 3,"I5 3 generacion");
         ram=new Ram("4 GB", "DDR3", "30MB/s", "Compaq",(byte) 2,"CompaqRam" );
        grafica= new TarjetaGrafica("40MHZ", "DDR5", "1GB", "Nvidia", (byte) 3, "Geforce 735M");
       
       computadores.add(new Computador(2400000, duro, procesador, ram, grafica, "Compaq", (byte) 2, "Presario C400"));
       
       duro=new DiscoDuro("500GB", "80MB/s", "Toshiba", (byte)3, "MX7");
       procesador= new Procesador("2,7GHZ", "64 bits", "Intel","4 nucleos",(byte) 3,"I5 3 generacion");
       ram=new Ram("16 GB", "DDR5", "30MB/s", "Samsung",(byte) 3,"MX60" );
       grafica= new TarjetaGrafica("40MHZ", "DDR2", "1GB", "Nvidia", (byte) 3, "Geforce M220");
       
       computadores.add(new Computador(2400000, duro, procesador, ram, grafica, "Toshiba", (byte) 2, "Tecra"));
       
         duro=new DiscoDuro("500GB", "80MB/s", "Apple", (byte)2, "AppleDiscos");
        procesador= new Procesador("2,7GHZ", "64 bits", "Intel","4 nucleos",(byte) 2,"I5 3 generacion");
         ram=new Ram("4 GB", "DDR5", "30MB/s", "Apple",(byte) 3,"AppleRams" );
        grafica= new TarjetaGrafica("40MHZ", "DDR5", "1GB", "Nvidia", (byte) 3, "Geforce 450M");
       
       computadores.add(new Computador(2800000, duro, procesador, ram, grafica, "Mac", (byte) 2, "MacBook Air"));
       
       
       
        duro=new DiscoDuro("500GB", "80MB/s", "Toshiba", (byte)2, "ToshibaDiscos");
        procesador= new Procesador("2.4GHZ", "64 bits", "Intel","4 nucleos",(byte) 1,"I3 1 generacion");
         ram=new Ram("4 GB", "DDR3", "30MB/s", "Toshiba",(byte) 2,"ToshibaRam" );
        grafica= new TarjetaGrafica("40MHZ", "DDR5", "1GB", "Nvidia", (byte) 1, "Geforce 320M");
       
       computadores.add(new Computador(1900000, duro, procesador, ram, grafica, "Toshiba", (byte) 1, "Satellite A6725"));
       
        duro=new DiscoDuro("750GB", "80MB/s", "Dell", (byte)2, "DellDiscos");
        procesador= new Procesador("3GHZ", "64 bits", "Intel","4 nucleos",(byte) 2,"I7 3 generacion");
         ram=new Ram("16 GB", "DDR3", "30MB/s", "Dell",(byte) 3,"DellRam" );
        grafica= new TarjetaGrafica("40MHZ", "DDR3", "2GB", "Nvidia", (byte) 3, "Geforce 950M");
       
       computadores.add(new Computador(3000000, duro, procesador, ram, grafica, "Dell", (byte) 3, "Alien Ware 13"));
       
       duro=new DiscoDuro("750GB", "80MB/s", "Dell", (byte)2, "DellDiscos");
        procesador= new Procesador("3GHZ", "64 bits", "Intel","4 nucleos",(byte) 2,"I5 3 generacion");
         ram=new Ram("16 GB", "DDR3", "30MB/s", "Dell",(byte) 3,"DellRam" );
        grafica= new TarjetaGrafica("40MHZ", "DDR5", "2GB", "Nvidia", (byte) 3, "Geforce 765M");
       
       computadores.add(new Computador(2400000, duro, procesador, ram, grafica, "Dell", (byte) 2, "Alien Ware 13"));
       
       duro=new DiscoDuro("120GB", "80MB/s", "Dell", (byte)1, "DellDiscos");
       procesador= new Procesador("2MHZ", "64 bits", "Intel","2 nucleos",(byte) 1,"Core 2 Duo");
       ram=new Ram("4GB", "DDR2", "30MB/s", "Dell",(byte) 2, "DellRam" );
       grafica= new TarjetaGrafica("20MHZ", "DDR2", "700MB", "Intel", (byte) 1, "Integrated");
       
       computadores.add(new Computador(1300000, duro, procesador, ram, grafica, "Dell", (byte) 1, "Inspiron 1725"));
               
       duro=new DiscoDuro("750GB", "80MB/s", "Toshiba", (byte)2, "ToshibaDiscos");
        procesador= new Procesador("2.5GHZ", "64 bits", "Intel","4 nucleos",(byte) 2,"I7 3 generacion");
         ram=new Ram("4 GB", "DDR3", "30MB/s", "Toshiba",(byte) 2,"ToshibaRam" );
        grafica= new TarjetaGrafica("40MHZ", "DDR3", "1GB", "Nvidia", (byte) 2, "Geforce 150M");
       
       computadores.add(new Computador(2500000, duro, procesador, ram, grafica, "Toshiba", (byte) 2, "Satellite S720"));
       
        duro=new DiscoDuro("250GB", "80MB/s", "Dell", (byte)2, "DellDiscos");
        procesador= new Procesador("2.4GHZ", "64 bits", "AMD","4 nucleos",(byte) 2,"Athlon X2");
         ram=new Ram("4 GB", "DDR3", "30MB/s", "Dell",(byte) 2,"DellRam" );
        grafica= new TarjetaGrafica("40MHZ", "DDR3", "700MB", "ATI", (byte) 2, "Radeon S345");
       
       computadores.add(new Computador(2000000, duro, procesador, ram, grafica, "Dell", (byte) 2, "Inspiron M556"));
       
        duro=new DiscoDuro("700GB", "80MB/s", "Compaq", (byte)2, "CompaqDiscos");
        procesador= new Procesador("2.5GHZ", "64 bits", "Intel","4 nucleos",(byte) 2,"I5 2 generacion");
         ram=new Ram("4 GB", "DDR3", "30MB/s", "Compaq",(byte) 2,"Compaq" );
        grafica= new TarjetaGrafica("40MHZ", "DDR3", "700GB", "Intel", (byte) 3, "Integrated");
       
       computadores.add(new Computador(2050000, duro, procesador, ram, grafica, "Compaq", (byte) 2, "Presario S213"));
       
       duro=new DiscoDuro("750GB", "80MB/s", "Compaq", (byte)2, "CompaqDiscos");
        procesador= new Procesador("2.5GHZ", "64 bits", "Intel","4 nucleos",(byte) 3,"I7 3 generacion");
         ram=new Ram("8 GB", "DDR3", "30MB/s", "Compaq",(byte) 2,"CompaqRam" );
        grafica= new TarjetaGrafica("40MHZ", "DDR5", "1GB", "Nvidia", (byte) 3, "Geforce 735M");
       
       computadores.add(new Computador(2700000, duro, procesador, ram, grafica, "Compaq", (byte) 2, "Presario C520"));
       
        
    }
    
    
}
