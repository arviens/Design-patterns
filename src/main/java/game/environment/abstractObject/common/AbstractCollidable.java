package game.environment.abstractObject.common;

import com.badlogic.gdx.physics.box2d.*;
import game.algorithm.IAlgorithm;
import game.environment.object.common.Sprite;

import static game.GameBase.world;

/**
 * Abstracts class used for store surrounding position
 */
public abstract class AbstractCollidable {
    private int x;
    private int y;
    private Sprite sprite;
    private IAlgorithm algorithm;
    private int price;
    public short isPlatform = 0;

    private BodyDef bodyDef;
    private Body body;


    public int getX() {
        return x;
    }

    public void setSprite(Sprite sprite) {
        this.sprite = sprite;
    }

    public Sprite getSprite() {
        return sprite;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public IAlgorithm getAlgorithm() {
        return algorithm;
    }

    public void move() {
        //TODO Add null object dp
        if (algorithm != null) {
            algorithm.move(this);
        }
        setX((int) body.getPosition().x);
        setY((int) body.getPosition().y);
    }

    public void setAlgorithm(IAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract boolean isNull();

    public Body getBody() {
        return body;
    }

    public void movingBody(){
        moving(BodyDef.BodyType.DynamicBody);
    }

    public void staticBody(){
        moving(BodyDef.BodyType.KinematicBody);
    }

    private void moving(BodyDef.BodyType type) {
        bodyDef = new BodyDef();
        bodyDef.type = type;
        bodyDef.position.set(this.getX(), this.getY());
        body = world.createBody(bodyDef);
        PolygonShape shape = new PolygonShape();
        shape.setAsBox(this.getSprite().getSprite().getWidth() / 2, this.getSprite().getSprite().getHeight() / 2);
        FixtureDef fixtureDef = new FixtureDef();

        fixtureDef.filter.groupIndex = isPlatform;
        fixtureDef.shape = shape;
        fixtureDef.density = 1f;
        body.createFixture(fixtureDef);
        shape.dispose();
    }

}
