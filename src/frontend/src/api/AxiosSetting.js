import axios from 'axios'

export const customAxios = () => {
	return axios.create({
	headers:{
		"Access-Control-Allow-Origin": "*",
	}
	})
}