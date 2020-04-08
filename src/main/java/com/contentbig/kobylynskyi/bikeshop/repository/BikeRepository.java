package com.contentbig.kobylynskyi.bikeshop.repository;

import com.contentbig.kobylynskyi.bikeshop.model.Bike;
import com.contentbig.kobylynskyi.bikeshop.model.BikeType;

import java.util.Collection;

public interface BikeRepository {

    Collection<Bike> findByType(BikeType type);

    Collection<Bike> findAll();

    Bike save(Bike bikeInput);
}
