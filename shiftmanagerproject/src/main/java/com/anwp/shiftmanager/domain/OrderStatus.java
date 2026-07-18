package com.anwp.shiftmanager.domain;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

public enum OrderStatus {

    CREATED, IN_PREPARATION, DELIVERED, CANCELED;

}