package game.factory.surrounding;


import game.environment.abstractObject.surrounding.obstacle.AbstractObstacle;
import game.environment.abstractObject.surrounding.platform.AbstractPlatform;

abstract class AbstractSurroundingFactory {
    abstract AbstractObstacle getObstacle(ObstacleType type);
    abstract AbstractPlatform getPlatform(PlatformType type);
}
