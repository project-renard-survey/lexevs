/*
 * Copyright: (c) 2004-2010 Mayo Foundation for Medical Education and 
 * Research (MFMER). All rights reserved. MAYO, MAYO CLINIC, and the
 * triple-shield Mayo logo are trademarks and service marks of MFMER.
 *
 * Except as contained in the copyright notice above, or as used to identify 
 * MFMER as the author of this software, the trade names, trademarks, service
 * marks, or product names of the copyright holder shall not be used in
 * advertising, promotion or otherwise in connection with this software without
 * prior written authorization of the copyright holder.
 * 
 * Licensed under the Eclipse Public License, Version 1.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at 
 * 
 * 		http://www.eclipse.org/legal/epl-v10.html
 * 
 */
package org.lexgrid.loader.rrf.model;
// Generated Feb 24, 2009 8:40:05 PM by Hibernate Tools 3.2.2.GA



/**
 * MrhierId generated by hbm2java
 */
public class Mrhier  implements java.io.Serializable {


     private String cui;
     private String aui;
     private String cxn;
     private String paui;
     private String sab;
     private String rela;
     private String ptr;
     private String hcd;
     private String cvf;

    public Mrhier() {
    }

    public Mrhier(String cui, String aui, String cxn, String paui, String sab, String rela, String ptr, String hcd, String cvf) {
       this.cui = cui;
       this.aui = aui;
       this.cxn = cxn;
       this.paui = paui;
       this.sab = sab;
       this.rela = rela;
       this.ptr = ptr;
       this.hcd = hcd;
       this.cvf = cvf;
    }
   
    public String getCui() {
        return this.cui;
    }
    
    public void setCui(String cui) {
        this.cui = cui;
    }
    public String getAui() {
        return this.aui;
    }
    
    public void setAui(String aui) {
        this.aui = aui;
    }
    public String getCxn() {
        return this.cxn;
    }
    
    public void setCxn(String cxn) {
        this.cxn = cxn;
    }
    public String getPaui() {
        return this.paui;
    }
    
    public void setPaui(String paui) {
        this.paui = paui;
    }
    public String getSab() {
        return this.sab;
    }
    
    public void setSab(String sab) {
        this.sab = sab;
    }
    public String getRela() {
        return this.rela;
    }
    
    public void setRela(String rela) {
        this.rela = rela;
    }
    public String getPtr() {
        return this.ptr;
    }
    
    public void setPtr(String ptr) {
        this.ptr = ptr;
    }
    public String getHcd() {
        return this.hcd;
    }
    
    public void setHcd(String hcd) {
        this.hcd = hcd;
    }
    public String getCvf() {
        return this.cvf;
    }
    
    public void setCvf(String cvf) {
        this.cvf = cvf;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof Mrhier) ) return false;
		 Mrhier castOther = ( Mrhier ) other; 
         
		 return ( (this.getCui()==castOther.getCui()) || ( this.getCui()!=null && castOther.getCui()!=null && this.getCui().equals(castOther.getCui()) ) )
 && ( (this.getAui()==castOther.getAui()) || ( this.getAui()!=null && castOther.getAui()!=null && this.getAui().equals(castOther.getAui()) ) )
 && ( (this.getCxn()==castOther.getCxn()) || ( this.getCxn()!=null && castOther.getCxn()!=null && this.getCxn().equals(castOther.getCxn()) ) )
 && ( (this.getPaui()==castOther.getPaui()) || ( this.getPaui()!=null && castOther.getPaui()!=null && this.getPaui().equals(castOther.getPaui()) ) )
 && ( (this.getSab()==castOther.getSab()) || ( this.getSab()!=null && castOther.getSab()!=null && this.getSab().equals(castOther.getSab()) ) )
 && ( (this.getRela()==castOther.getRela()) || ( this.getRela()!=null && castOther.getRela()!=null && this.getRela().equals(castOther.getRela()) ) )
 && ( (this.getPtr()==castOther.getPtr()) || ( this.getPtr()!=null && castOther.getPtr()!=null && this.getPtr().equals(castOther.getPtr()) ) )
 && ( (this.getHcd()==castOther.getHcd()) || ( this.getHcd()!=null && castOther.getHcd()!=null && this.getHcd().equals(castOther.getHcd()) ) )
 && ( (this.getCvf()==castOther.getCvf()) || ( this.getCvf()!=null && castOther.getCvf()!=null && this.getCvf().equals(castOther.getCvf()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCui() == null ? 0 : this.getCui().hashCode() );
         result = 37 * result + ( getAui() == null ? 0 : this.getAui().hashCode() );
         result = 37 * result + ( getCxn() == null ? 0 : this.getCxn().hashCode() );
         result = 37 * result + ( getPaui() == null ? 0 : this.getPaui().hashCode() );
         result = 37 * result + ( getSab() == null ? 0 : this.getSab().hashCode() );
         result = 37 * result + ( getRela() == null ? 0 : this.getRela().hashCode() );
         result = 37 * result + ( getPtr() == null ? 0 : this.getPtr().hashCode() );
         result = 37 * result + ( getHcd() == null ? 0 : this.getHcd().hashCode() );
         result = 37 * result + ( getCvf() == null ? 0 : this.getCvf().hashCode() );
         return result;
   }   


}