package GouriOpenCV;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

/**
 * A simple class that demonstrates/tests the usage of the OpenCV library in
 * Java. It prints a 3x3 identity matrix and then converts a given image in gray
 * scale.
**/

public class rgbtogray {

	public static void main(String[] args){
		
		// load the OpenCV native library
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		
		// create and print on screen a 3x3 identity matrix
		System.out.println("Creating a 3x3 identity matrix");
		
		//mat.eye is an identity matrix. We set the dimensions of 3x3 and specify the type of its elements.
		Mat mat = Mat.eye(3,3, CvType.CV_8UC1);
		System.out.println("Mat=" +mat.dump());
		
/**The class Mat represents an n-dimensional dense numerical single-channel or multi-channel array. 
 * It can be used to store real or complex-valued vectors and matrices, grayscale or color images, 
 * voxel volumes, vector fields, point clouds, tensors, histograms.
 **/
		
		// prepare to convert a RGB image in gray scale
		String location = "C:/Users/admin/Downloads/GOURI/Courses & Learning/OpenCv/RGB to Grayscale image/pic.jpg"; //write the location of the image here
		System.out.println("Convert the image at " + location + " in gray scale ");
				
		// get the jpg image from the internal resource folder
		Mat image = Imgcodecs.imread(location);
				
		Mat gray_image= new Mat();
		// convert the image in gray scale
		Imgproc.cvtColor(image,gray_image, Imgproc.COLOR_RGB2GRAY);
				
		// write the new image on disk
		Imgcodecs.imwrite("C:/Users/admin/Downloads/GOURI/Courses & Learning/OpenCv/RGB to Grayscale image/pic2.jpg", gray_image); 
		// for a copy of the picture, write a different name for the picture in the end
		
		System.out.println("Done!");
		
	}
}
