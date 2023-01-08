package com.cydeo.repository;

import com.cydeo.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region, Integer> {
    //Display all regions in Canada
    //get, find, read meaning select
    List<Region> findByCountry(String country);
    List<Region> getByCountry(String country);//same thing
    //Display all regions with country name includes 'United'
    List<Region>  findByCountryContaining(String country);

    //Display all regions with country name includes 'United' in order(region)
    List<Region> findByCountryContainingOrderByRegionDesc(String country);

    //Display top 2 regions in United States
    List<Region> findTop2ByCountry(String country);

    List<Region> findTopByCountryContainsOrderByRegion(String country);




}
