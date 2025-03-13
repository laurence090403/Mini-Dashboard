package com.example.cryptodashboard.service;

import com.example.cryptodashboard.model.Crypto;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class CryptoService {
    private static final String API_URL = "https://api.coingecko.com/api/v3/coins/markets?vs_currency=usd&order=market_cap_desc&per_page=10&page=1&sparkline=false";

    private final RestTemplate restTemplate = new RestTemplate();

    @Cacheable("cryptos")
    public List<Crypto> getCryptos() {
        Crypto[] cryptos = restTemplate.getForObject(API_URL, Crypto[].class);
        return Arrays.asList(cryptos);
    }

    @Cacheable("top3cryptos")
    public List<Crypto> getTop3Cryptos() {
        return getCryptos().stream()
                .sorted((c1, c2) -> Double.compare(c2.getPrice_change_percentage_24h(), c1.getPrice_change_percentage_24h()))
                .limit(3)
                .toList();
    }
}
