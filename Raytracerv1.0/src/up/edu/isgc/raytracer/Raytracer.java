/**
 * [1968] - [2020] Centros Culturales de Mexico A.C / Universidad Panamericana
 * All Rights Reserved.
 */
package up.edu.isgc.raytracer;

import up.edu.isgc.raytracer.lights.DirectionalLight;
import up.edu.isgc.raytracer.lights.Light;
import up.edu.isgc.raytracer.lights.PointLight;
import up.edu.isgc.raytracer.objects.*;
import up.edu.isgc.raytracer.tools.OBJReader;

import javax.imageio.ImageIO;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author Benjamin Godoy
 * @author Jafet Rodríguez
 */
public class Raytracer {

    public static void main(String[] args) {

        System.out.println(new Date());

        //Scene 01
/*
        Scene scene01 = new Scene();
        scene01.setCamera(new Camera(new Vector3D(0, 0, -8), 160, 160, 400, 400, 7.2f, 50f));
        //scene01.addLight(new DirectionalLight(Vector3D.ZERO(), new Vector3D(0.0, 0.0, 1.0), Color.WHITE, 4));
        //scene01.addLight(new DirectionalLight(Vector3D.ZERO(), new Vector3D(0.0, -0.1, 0.1), Color.WHITE, 0.2));
        scene01.addLight(new DirectionalLight(Vector3D.ZERO(), new Vector3D(-0, -0, 2.0), Color.WHITE, 5));
        scene01.addLight(new PointLight(new Vector3D(1f, 1f, -0f), Color.WHITE, 10));
        scene01.addLight(new PointLight(new Vector3D(-0.3f, 2f, 0f), Color.WHITE, 10));
        scene01.addObject(new Sphere(new Vector3D(0.35f, 1f, 2.5f), 0.4f, Color.MAGENTA));
        scene01.addObject(new Sphere(new Vector3D(1.85f, 1f, 4.5f), 0.3f, Color.PINK));

        scene01.addObject(OBJReader.GetPolygon("model.obj", new Vector3D(-0.4f, -2.5f, 1.5f), Color.RED));
        scene01.addObject(OBJReader.GetPolygon("cube.obj", new Vector3D(-3f, -2.5f, 3f), Color.GREEN));
        scene01.addObject(OBJReader.GetPolygon("SmallTeapot.obj", new Vector3D(2.3f, -1f, 1.5f), Color.YELLOW));
        scene01.addObject(OBJReader.GetPolygon("Ring.obj", new Vector3D(2.3f, -1.0f, 1.5f), Color.WHITE));
        scene01.addObject(OBJReader.GetPolygon("Platform.obj", new Vector3D(0f, -3.0f, -1f), Color.GRAY));
        BufferedImage image = raytrace(scene01);
*/

        //Scene 02
/*
        Scene scene02 = new Scene();
        scene02.setCamera(new Camera(new Vector3D(0.5, 0, -8), 160, 160, 4000, 4000, 8.2f, 50f));
        scene02.addLight(new PointLight(new Vector3D(-1.5f, 0f, -1f), Color.WHITE, 10));
        scene02.addLight(new PointLight(new Vector3D(0f, 2f, -1.5f), Color.WHITE, 10));
        scene02.addLight(new DirectionalLight(Vector3D.ZERO(), new Vector3D(-0, -0, 2.0), Color.WHITE, 5));
        scene02.addObject(OBJReader.GetPolygon("bigBunny.obj", new Vector3D(0f, -0.7f, 2f), Color.PINK));
        scene02.addObject(OBJReader.GetPolygon("CubeRot.obj", new Vector3D(-0f, -1.5f, 2f), Color.GREEN));
        scene02.addObject(OBJReader.GetPolygon("SmallTeapot.obj", new Vector3D(2.5f, -2.5f, 1.5f), Color.WHITE));
        scene02.addObject(OBJReader.GetPolygon("RingTilt1.obj", new Vector3D(2.8f, -0f, 1.5f), Color.PINK));
        scene02.addObject(OBJReader.GetPolygon("RingTilt2.obj", new Vector3D(-0.5f, 2f, 1.7f), Color.RED));
        scene02.addObject(OBJReader.GetPolygon("wall.obj", new Vector3D(0f, -3.0f, 5f), Color.BLUE));

        BufferedImage image = raytrace(scene02);
*/
        //Scene 3

        Scene scene03 = new Scene();
        scene03.setCamera(new Camera(new Vector3D(0.5, 0, -8), 160, 160, 200, 200, 8.2f, 50f));
        scene03.addObject(OBJReader.GetPolygon("SmallTeapot.obj", new Vector3D(0f, 0f, 3f), Color.GRAY));
        scene03.addLight(new PointLight(new Vector3D(0f, 2f, 1f), Color.WHITE, 10));
        scene03.addLight(new PointLight(new Vector3D(3f, 1f, -3f), Color.WHITE, 7));
        scene03.addLight(new DirectionalLight(Vector3D.ZERO(), new Vector3D(-5, -0, 0), Color.BLUE, 5));
        scene03.addLight(new DirectionalLight(Vector3D.ZERO(), new Vector3D(5, -0, -2.0), Color.RED, 5));
        scene03.addObject(OBJReader.GetPolygon("model.obj", new Vector3D(-0.4f, -2.5f, 1.5f), Color.GRAY));
        scene03.addObject(OBJReader.GetPolygon("Ring.obj", new Vector3D(-0.4f, -2f, 1.5f), Color.WHITE));
        scene03.addObject(OBJReader.GetPolygon("Platform.obj", new Vector3D(0f, -3.0f, 0f), Color.YELLOW));
        scene03.addObject(OBJReader.GetPolygon("model.obj", new Vector3D(1.7f, -1.8f, 2f), Color.WHITE));
        scene03.addObject(OBJReader.GetPolygon("Ring.obj", new Vector3D(1.7f, -1.3f, 2f), Color.ORANGE));
        scene03.addObject(OBJReader.GetPolygon("RingTilt.obj", new Vector3D(0f, 2.3f, 2f), Color.MAGENTA));
        scene03.addObject(new Sphere(new Vector3D(2f, 2.5f, 2.5f), 0.8f, Color.PINK));
        scene03.addObject(OBJReader.GetPolygon("bigBunny.obj", new Vector3D(3.5f, -2.7f, 2f), Color.PINK));

        BufferedImage image = raytrace(scene03);


        File outputImage = new File("image.png");
        try {
            ImageIO.write(image, "png", outputImage);
        } catch (IOException ioe) {
            System.out.println("Something failed");
        }
        System.out.println(new Date());
    }

    /**
     *
     * @param scene class containing an array of objects and other for lights
     * @return the final image after calculating the specular, shadow and reflection for each pixel
     *
     * ExecutorService allows the CPU cores run the code with threads
     * Runnable runs the code with all threads declared
     */
    public static BufferedImage raytrace(Scene scene) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        Camera mainCamera = scene.getCamera();
        ArrayList<Light> lights = scene.getLights();
        float[] nearFarPlanes = mainCamera.getNearFarPlanes();
        BufferedImage image = new BufferedImage(mainCamera.getResolutionWidth(), mainCamera.getResolutionHeight(), BufferedImage.TYPE_INT_RGB);
        ArrayList<Object3D> objects = scene.getObjects();

        Vector3D[][] positionsToRaytrace = mainCamera.calculatePositionsToRay();
        for (int i = 0; i < positionsToRaytrace.length; i++) {
            for (int j = 0; j < positionsToRaytrace[i].length; j++) {
                double x = positionsToRaytrace[i][j].getX() + mainCamera.getPosition().getX();
                double y = positionsToRaytrace[i][j].getY() + mainCamera.getPosition().getY();
                double z = positionsToRaytrace[i][j].getZ() + mainCamera.getPosition().getZ();

                Ray ray = new Ray(mainCamera.getPosition(), new Vector3D(x, y, z));
                Runnable runnable= imageCreator(i,j,mainCamera, ray, objects, nearFarPlanes, lights, image);
                executorService.execute(runnable);

            }
        }

        executorService.shutdown();

         //This closes all the threads if the process has been going for more than 5 hours
        try{
            if(!executorService.awaitTermination(5, TimeUnit.HOURS)){
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if(!executorService.isTerminated()){
                System.err.println("Cancel non-finished");
            }
        }
        executorService.shutdownNow();
        return image;
    }

    /**
     *
     * @param i position in x of the pixel
     * @param j position in y of the pixel
     * @param mainCamera is the camera of the scene, rays are casted and colors are determined by the position of the camera
     * @param ray a Ray() used to get values of the objects intersected and from the caster
     * @param objects array of objects used to calculate color of pixels
     * @param nearFarPlanes limited area in which the camera notices objects
     * @param lights array of lights to calculate color in each pixel
     * @param image the buffered image to write on
     * @return a runnable that get and set the pixel color
     */
    public static Runnable imageCreator(int i,int j,Camera mainCamera,Ray ray,ArrayList<Object3D> objects,float[] nearFarPlanes,ArrayList<Light> lights,BufferedImage image){
        Runnable aRunnable = new Runnable() {
            @Override
            public void run() {
                float cameraZ = (float) mainCamera.getPosition().getZ();
                Intersection closestIntersection = raycast(ray, objects, null, new float[]{cameraZ + nearFarPlanes[0], cameraZ + nearFarPlanes[1]});

                //Background color
                Color pixelColor = Color.BLACK;
                if (closestIntersection != null) {
                    pixelColor = Color.BLACK;
                    for (Light light : lights) {
                        Ray shadow = new Ray(closestIntersection.getPosition(),light.getPosition());
                        Intersection secondIntersection = raycast(shadow,objects,closestIntersection.getObject(),new float[]{cameraZ + nearFarPlanes[0], cameraZ + nearFarPlanes[1]});
                        float nDotL = light.getNDotL(closestIntersection);
                        float intensity = (float) light.getIntensity() * nDotL;

                        float distance= (float) Math.sqrt(Math.pow(light.getPosition().getX() - closestIntersection.getPosition().getX(),2)+Math.pow(light.getPosition().getY() - closestIntersection.getPosition().getY(),2)+Math.pow(light.getPosition().getZ() - closestIntersection.getPosition().getZ(),2));
                        float fallOff = (float) (intensity/Math.pow(distance,1.3));
                        Color lightColor = light.getColor();
                        Color objColor = closestIntersection.getObject().getColor();
                        float[] lightColors = new float[]{lightColor.getRed() / 255.0f, lightColor.getGreen() / 255.0f, lightColor.getBlue() / 255.0f};
                        float[] objColors = new float[]{objColor.getRed() / 255.0f, objColor.getGreen() / 255.0f, objColor.getBlue() / 255.0f};

                        Vector3D IntersectionNormal=closestIntersection.getNormal();
                        Vector3D CameraPos = mainCamera.getPosition();
                        Vector3D lightPos = light.getPosition();
                        Vector3D ligthPluscam=Vector3D.normalize(Vector3D.add(CameraPos,lightPos));
                        float mag = (float) Vector3D.magnitude(ligthPluscam);
                        Vector3D halfV2 = Vector3D.scalarMultiplication(ligthPluscam,1/mag);
                        float NdH =(float) Vector3D.dotProduct(IntersectionNormal,halfV2);
                        float shine= (float)1.3;
                        float specular = (float)Math.pow(NdH,shine);
                        float[] reflectRGB={0f,0f,0f};

                        Vector3D reflection = Vector3D.substract(closestIntersection.getPosition(), mainCamera.getPosition());
                        double normalRay = -2.0 * Vector3D.dotProduct(closestIntersection.getNormal(), reflection);
                        Vector3D reflectV = Vector3D.scalarMultiplication(closestIntersection.getNormal(), normalRay);

                        reflectV = Vector3D.add(reflection, reflectV);

                        Ray reflectHit = new Ray(closestIntersection.getPosition(), reflectV);
                        Intersection reflInter = Raytracer.raycast(reflectHit, objects, closestIntersection.getObject(), null);



                        if(reflInter!=null&& closestIntersection.getObject()!=reflInter.getObject()){
                            reflectRGB[0]=  reflInter.getObject().getColor().getRed()/255.0f;
                            reflectRGB[1]=  reflInter.getObject().getColor().getGreen()/255.0f;
                            reflectRGB[2]=  reflInter.getObject().getColor().getBlue()/255.0f;
                            for (int colorIndex = 0; colorIndex < objColors.length; colorIndex++) {
                                objColors[colorIndex] *= specular *fallOff * reflectRGB[colorIndex] *lightColors[colorIndex];

                            }
                        }else{
                            for (int colorIndex = 0; colorIndex < objColors.length; colorIndex++) {
                                objColors[colorIndex] *= specular *fallOff  *lightColors[colorIndex];

                            }

                        }


                        Color diffuse = new Color(clamp(objColors[0], 0, 1),clamp(objColors[1], 0, 1),clamp(objColors[2], 0, 1));


                        if(secondIntersection!=null){
                            diffuse=Color.BLACK;
                        }

                        pixelColor = addColor(pixelColor, diffuse);
                    }
                }
                setColor(i,j,pixelColor,image);


            }
        };
        return aRunnable;
    }


    /**
     *
     * @param i position in x of pixel in image
     * @param j position in y of pixel in image
     * @param pixelColor the color calculated by the Runnable imageCreator()
     * @param image the image to write the pixel on
     */
    public static synchronized void setColor(int i, int j, Color pixelColor, BufferedImage image){
        image.setRGB(i, j, pixelColor.getRGB());
    }

    /**
     *
     * @param value a float
     * @param min min value
     * @param max max value
     * @return limitates the value with the max and min
     */
    public static float clamp(float value, float min, float max) {
        if (value < min) {
            return min;
        }
        if (value > max) {
            return max;
        }
        return value;
    }

    /**
     *
     * @param original a Color
     * @param otherColor other color
     * @return a color representing the sum of two with clamp() values
     */
    public static Color addColor(Color original, Color otherColor){
        float red = clamp((original.getRed() / 255.0f) + (otherColor.getRed() / 255.0f), 0, 1);
        float green = clamp((original.getGreen() / 255.0f) + (otherColor.getGreen() / 255.0f), 0, 1);
        float blue = clamp((original.getBlue() / 255.0f) + (otherColor.getBlue() / 255.0f), 0, 1);
        return new Color(red, green, blue);
    }

    /**
     *
     * @param ray a Ray with origin and direction
     * @param objects array of objects to evaluate intersection with ray
     * @param caster object in which the ray is projected
     * @param clippingPlanes limited area in which the intersections are calculated
     * @return the closest intersection of the ray
     */
    public static Intersection raycast(Ray ray, ArrayList<Object3D> objects, Object3D caster, float[] clippingPlanes) {
        Intersection closestIntersection = null;

        for (int k = 0; k < objects.size(); k++) {
            Object3D currentObj = objects.get(k);
            if (caster == null || !currentObj.equals(caster)) {
                Intersection intersection = currentObj.getIntersection(ray);
                if (intersection != null) {
                    double distance = intersection.getDistance();
                    if (distance >= 0 &&
                            (closestIntersection == null || distance < closestIntersection.getDistance()) &&
                            (clippingPlanes == null || (intersection.getPosition().getZ() >= clippingPlanes[0] &&
                                    intersection.getPosition().getZ() <= clippingPlanes[1]))) {
                        closestIntersection = intersection;
                    }
                }
            }
        }

        return closestIntersection;
    }
}
