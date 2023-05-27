package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDaoImp;
import web.dao.CarDao;
import web.model.Car;
import java.util.List;

@Service
public class CarServiceImp implements CarService{

    @Autowired
    CarDao carDao= new CarDaoImp();

    @Override
    public List<Car> getCarsSize(int size) {
        return carDao.getCarsSize(size);
    }
}
