/*
Created by Helm  25/1/16.
*/


package cat.helm.basearchitecture.entities.mapper;

import cat.helm.basearchitecture.entities.DummyDataEntity;
import cat.helm.basearchitecture.model.Dummy;

public class DummyDataEntityMapper {

    public Dummy map (DummyDataEntity dummyDataEntity){
        return new Dummy(dummyDataEntity.getString());
    }
}
