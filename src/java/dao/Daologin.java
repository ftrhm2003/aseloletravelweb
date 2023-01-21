/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import pojo.aseloleUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.TabelUser;

/**
 *
 * @author Asus
 */
public class Daologin {
    public List<TabelUser> getBy(String uName, String uPass){
        Transaction trans  = null;
        TabelUser us = new TabelUser();
        List<TabelUser> user = new ArrayList();

         Session session = aseloleUtil.getSessionFactory().openSession();
         try{
             trans = session.beginTransaction();
             Query query = session.createQuery("from TabelUser where username=:uName AND password=:uPass ");
             query.setString("uName", uName);
             query.setString("uPass", uPass);
             us = (TabelUser) query.uniqueResult();
             user = query.list();
             trans.commit();
         }
         catch (Exception e){
              System.out.println(e);
         } 
         return user;
    }
}
