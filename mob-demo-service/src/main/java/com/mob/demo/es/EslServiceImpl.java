//package com.mob.demo.es;
//
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class EslServiceImpl implements EslService
//{
//    @Autowired
//    private ClienteRepository clienteDao;
//
//    private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(EslServiceImpl.class);
//
//    @Override
//    public Cliente findCliente(String id)
//    {
//
//        Cliente cliente = clienteDao.findOne(id);
//        LOG.info(" get cliente by id {} is {}", id, cliente);
//        return cliente;
//    }
//}