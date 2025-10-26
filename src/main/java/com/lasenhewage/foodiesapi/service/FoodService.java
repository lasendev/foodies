package com.lasenhewage.foodiesapi.service;

import com.lasenhewage.foodiesapi.io.FoodRequest;
import com.lasenhewage.foodiesapi.io.FoodResponse;
import org.springframework.web.multipart.MultipartFile;

public interface FoodService {

    String uploadFile(MultipartFile file);

    FoodResponse addFood(FoodRequest request, MultipartFile file);



}
