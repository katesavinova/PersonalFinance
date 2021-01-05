/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalfinance.settings.model;

/**
 *
 * @author savinova
 */
abstract public class Common {
    //методы для возвращения стоки для выпадающего списка
    public String getValueForComboBox(){ return null;}
    
    //методы обозначающие дествия после добавления, редактирования, удаления
    public void postAdd(){}
    public void postEdit(){}
    public void postRemove(){}
    
}
