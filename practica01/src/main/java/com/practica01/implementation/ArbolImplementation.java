/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica01.implementation;

import com.practica01.dao.ArbolDao;
import com.practica01.domain.Arbol;
import com.practica01.service.ArbolService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class ArbolImplementation implements ArbolService{
    @Autowired
    private ArbolDao arbolDao;

    @Override
    @Transactional(readOnly=true)
    public List<Arbol> getArboles(boolean activos) {
        var lista=arbolDao.findAll();
        if (activos) {
           lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }
}
