/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalfinance.settings;

import java.util.HashMap;

/**
 *
 * @author savinova
 */
final public class Text {
    
    private static final HashMap<String, String> data = new HashMap();
    //“ассоциативный массив”. Внутри Map данные хранятся в формате “ключ”-”значение”, то есть по парам.
    public static String get(String key){ return data.get(key);}
    public static String[] getMonths(){
    String[] months = new String[12];
        months[0] = get("JANUARY");
        months[1] = get("FEBRUARY");
        months[2] = get("MARCH");
        months[3] = get("APRIL");
        months[4] = get("MAY");
        months[5] = get("JUNE");
        months[6] = get("JULY");
        months[7] = get("AUGUST");
        months[8] = get("SEPTEMBER");
        months[9] = get("OCTOBER");
        months[10] = get("NOVEMBER");
        months[11] = get("DECEMBER");
    return months;
    }
    
    public static void init(){
        data.put("PROGRAM_NAME", "Домашняя бугалтерия"); 
        data.put("MENU_FILE", "Файл");
        data.put("MENU_EDIT", "Правка"); 
        data.put("MENU_VIEW", "Вид"); 
        data.put("MENU_HELP", "Помощь"); 
       
         data.put("JANUARY", "Январь"); 
         data.put("FEBRUARY", "Февраль"); 
         data.put("MARCH", "Март"); 
         data.put("APRIL", "Апрель"); 
         data.put("MAY", "Май"); 
         data.put("JUNE", "Июнь"); 
         data.put("JULY", "Июль"); 
         data.put("AUGUST", "Август"); 
         data.put("SEPTEMBER", "Сентябрь"); 
         data.put("OCTOBER", "Октябрь"); 
         data.put("NOVEMBER", "Ноябрь"); 
         data.put("DECEMBER", "Декабрь"); 
        
    }
    
}
