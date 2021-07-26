package com.example.demo.repository;

import com.example.demo.model.Point;
import com.example.demo.model.Toilet;
import java.util.Arrays;
import java.util.List;

@org.springframework.stereotype.Repository
public class MockedToiletRepository implements Repository{

    @Override
    public List<Toilet> getAll() {
        return Arrays.asList(
                new Toilet("A", new Point(1, 5)),
                new Toilet("B", new Point(8, 2)),
                new Toilet("C", new Point(4, 9))
        );
    }
}
