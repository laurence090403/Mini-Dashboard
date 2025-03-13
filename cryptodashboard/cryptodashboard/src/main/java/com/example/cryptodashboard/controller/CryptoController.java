package com.example.cryptodashboard.controller;

import com.example.cryptodashboard.model.Crypto;
import com.example.cryptodashboard.service.CryptoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RestController
@RequestMapping("/cryptos")
@CrossOrigin(origins = "http://127.0.0.1:4200/")
public class CryptoController {

    private final CryptoService cryptoService;

    public CryptoController(CryptoService cryptoService) {
        this.cryptoService = cryptoService;
    }

    @GetMapping
    public List<Crypto> getAllCryptos() {
        return cryptoService.getCryptos();
    }

    @GetMapping("/top3")
    public List<Crypto> getTop3Cryptos() {
        return cryptoService.getTop3Cryptos();
    }
}
