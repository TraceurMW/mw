package com.mw.Study.diveiinspringboot.repository;

import com.mw.Study.diveiinspringboot.annotation.FirsetLevelRepository;
import com.mw.Study.diveiinspringboot.annotation.SecondLevelRepository;
import org.springframework.stereotype.Component;

//@FirsetLevelRepository("myFirstLevelRepository")
@SecondLevelRepository("myFirstLevelRepository")
public class MyFirstLevelRepository {

}
