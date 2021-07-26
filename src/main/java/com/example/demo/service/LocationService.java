package com.example.demo.service;

import com.example.demo.model.Point;
import com.example.demo.model.PointDistance;
import com.example.demo.model.Toilet;
import com.example.demo.repository.Repository;
import java.util.Comparator;
import org.springframework.stereotype.Service;

import static com.example.demo.service.PointsDistanceCalculatorUtils.calculateDistanceBetweenPoints;

@Service
public class LocationService {
    private final Repository mockedRepo;

    public LocationService(Repository mockedRepo) {
        this.mockedRepo = mockedRepo;
    }

    public PointDistance findShortestDistance(Point point){
       return mockedRepo.getAll().stream().map(Toilet::getP).map(repoPoint -> new PointDistance(repoPoint,
                calculateDistanceBetweenPoints(point.getX(),point.getY(),
                repoPoint.getX(),repoPoint.getY()))).min(Comparator.comparingDouble(PointDistance::getDistance)).get();
    }
}
