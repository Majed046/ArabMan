package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

public class GameWorld extends World {

    public GameWorld(){

        //make the ground
        Shape shape = new BoxShape(16, 0.5f);
        StaticBody ground = new StaticBody(this, shape);
        ground.setPosition(new Vec2(0f, -15.5f));

        //make the ceiling
        Shape shape2 = new BoxShape(16, 0.5f);
        StaticBody ceiling = new StaticBody(this, shape);
        ceiling.setPosition(new Vec2(0f, 15.5f));

        // make two platforms
        Shape platformShape = new BoxShape(3.5f, 0.5f);
        StaticBody platform1 = new StaticBody(this, platformShape);
        platform1.setPosition(new Vec2(12, 10.5f));
        //platform1.setAngleDegrees(-30);
        platform1.addImage(new BodyImage("data/tile2.png", 3));

        StaticBody platform2 = new StaticBody(this, platformShape);
        platform2.setPosition(new Vec2(-8, -10f));
        platform2.addImage(new BodyImage("data/sandtile.png", 6));

        StaticBody platform3 = new StaticBody(this, platformShape);
        platform3.setPosition(new Vec2(6, -8f));
        platform3.addImage(new BodyImage("data/platform.png", 4));


        //make the walls
        Shape wallShape = new BoxShape(0.5f,15);
        StaticBody wall1 = new StaticBody(this, wallShape);
        wall1.setPosition(new Vec2(-15.5f,0));

        StaticBody wall2 = new StaticBody(this, wallShape);
        wall2.setPosition(new Vec2(15.5f,0));

        man man = new man(this);
        man.setPosition(new Vec2(7,-6));

        //drop a ball on the student's head
        Shape ballShape = new CircleShape(1f);
        DynamicBody ball = new DynamicBody(this, ballShape);
        ball.setPosition(new Vec2(7, 1f));


        //create a shape for the head (use PolygonEditor)
      //  PolygonShape headShape = new PolygonShape( /*coords from PolygonEditor*/);
        //create a shape for the handle (use PolygonEditor)
       // PolygonShape handleShape = new PolygonShape( /*coords from PolygonEditor*/ );
        //create the actual body and add it to the World
       // DynamicBody hammer = new DynamicBody(this); //create the hammer (no shape yet) and add it to world
        //create fixtures for head and handle and add them to
        //the hammer Body
       // SolidFixture head = new SolidFixture(hammer, headShape); //create the head fixture and add it to hammer
       // head.setDensity(20);
       // SolidFixture handle = new SolidFixture(hammer, handleShape); //create handle fixture and add it to hammer
        //attach the image
       // hammer.addImage(new BodyImage("data/hammer.png",4));
        //set the hammer's position
       // hammer.setPosition(new Vec2(0,5));


        //try this to see the effect of changing the
        //density of the hammer head
        //hammer.setAngularVelocity(10f);




    }
}
