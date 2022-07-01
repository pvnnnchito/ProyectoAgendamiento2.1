package com.equipo1.services;

import com.equipo1.repositories.NegocioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NegocioService {
    @Autowired
    NegocioRepository negocioRepository;
}
